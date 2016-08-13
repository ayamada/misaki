; @layout post
; @nocache true
; @title ＢＨＤ
; @version 1.1.1
; @comment version 1.1.1
; @date 2016/03/28

(defn site->date [site]
  (let [dtf (org.joda.time.format.DateTimeFormat/forPattern "yyyy/MM/dd")]
    (.print dtf (:date site))))

(defn a-href [url & [label]]
  [:a {:href url} (or label url)])

(defn a-href-external [url & [label]]
  [:a {:href url, :target "_blank"} (or label url)])

(defn li [& args] (apply vector :li args))


;;; heading-2は自動的にtocとして扱う
(def toc-entries (atom []))
(defmacro heading-2 [title & [desc]]
  (swap! toc-entries conj [title desc])
  `(let [title# ~title
         desc# ~desc]
     [:div
      (h2 {:id title#} title#)
      (if desc# (p {:class "desc"} desc#) "")
      ]))

(defn toc []
  (let [lis (map (fn [[title desc]]
                   (let [url (str "#" title)
                         label (if desc
                                 (str title " - " desc)
                                 title)]
                     [:li (a-href url label)]))
                 @toc-entries)]
    `[:ul ~@lis]))








(p {:class "desc"} "version: " (:version site) " (" (site->date site) ")")

(p
 (a-href-external "http://ahoge.info/" "第19回あほげー")
 "エントリー作品"
 "「ＢＨＤ」取扱説明書ページです。")

[:ul
 [:li "お題は「ダイエット」でした。"]
 ]


;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")

[:ul [:li (a-href-external "http://vnctst.tir.jp/op0017/")]]



(heading-2 "History" "更新履歴")

[:dl
 [:dt "2016/03/28 version 1.1.1"]
 [:dd [:ul
       [:li "エンディングボタン回りを改善"]
       [:li "androidで一部の背景が表示されない不具合を修正"]
       [:li "一部UIの不具合の修正と改善"]
       [:li "内部利用ライブラリのバージョンアップ"]
       ]]
 [:dt "2016/03/26 version 1.1.0"]
 [:dd [:ul
       [:li "エンディングを多数追加"]
       [:li "未使用アセットを除去してロード時間を短縮"]
       [:li "スコアの単位を「％」から「kg」に変更"]
       [:li "その他、細かい表記等の変更"]
       [:li "フェード等、細かい演出の強化"]
       [:li "フォントを源真ゴシックに変更"]
       ]]
 [:dt "2016/03/20 version 1.0.1"]
 [:dd [:ul [:li "同名のハッシュタグが既に利用されていたので、今回は、個別のハッシュタグを指定するのをやめておく"]]]
 [:dt "2016/03/20 version 1.0.0 あほげー登録バージョン"]
 [:dd [:ul [:li "公開"]]]
 ]


(heading-2 "Resources" "利用ライブラリ、利用素材など")

[:p "(敬称略)"]

[:dl
 [:dt "ライブラリ類"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript" "ClojureScript")]
 [:dd (a-href-external "http://www.pixijs.com/" "pixi.js")]
 [:dd (a-href-external "https://github.com/CyberAgent/boombox.js" "boombox.js")]
 [:dt "フォント"]
 [:dd
  (a-href-external "http://jikasei.me/font/genshin/" "源真ゴシック")
  " ("
  (a-href-external "http://jikasei.me/font/genshin/#_7" "ライセンス詳細")
                   ")"]
 [:dt "ＢＧＭ"]
 [:dd (a-href-external "http://commons.nicovideo.jp/user/upload/659862?t=audio" "ニコニコ自作ゲームフェス用ニコ素材")]
 [:dt "グラフィック素材提供"]
 [:dd (a-href-external "http://www.irasutoya.com/" "いらすとや")]
 [:dt "企画、プログラミング、グラフィック加工、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "Advice" "攻略のヒント")

[:ul
 (li "点火中は姿勢制御機構が働き、自転速度が大きく低下します")
 (li "死亡確定ルートを把握し、そこに合流してしまわないように微調整しつつ"
     "周回していきましょう")
 (li "非常に安定した周回ルートも存在しますが、"
     "少しずつ重力源に近付き、最終的には脱出不可能な領域へと突入します。"
     "そうなる前にルートを変更しましょう")
 ]


