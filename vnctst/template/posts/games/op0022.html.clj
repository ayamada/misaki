; @layout post
; @nocache true
; @title ブーヤンスレイヤー
; @version 0.1.1
; @comment version 0.1.1
; @date 2016/10/09

(defn site->date [site]
  (let [dtf (org.joda.time.format.DateTimeFormat/forPattern "yyyy/MM/dd")]
    (.print dtf (:date site))))

(defn a-href [url & [label]]
  [:a {:href url} (or label url)])

(defn a-href-external [url & [label]]
  [:a {:href url, :target "_blank" :rel "noopener noreferrer"} (or label url)])

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
 (a-href-external "http://ahoge.info/" "第20回あほげー")
 "エントリー作品"
 "「ブーヤンスレイヤー」取扱説明書ページです。")

[:ul
 [:li "お題は「エレベーター」でした。"]
 [:li "詳しい説明はあとで書きます。"]
 ]


;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")

[:ul [:li (a-href-external "http://vnctst.tir.jp/op0022/")]]



(heading-2 "History" "更新履歴")

[:dl
 [:dt "2016/10/09 version 0.1.1"]
 [:dd [:ul
       [:li "難易度の調整"]
       [:li "簡易説明文を試験的に追加"]
       [:li "使っていないアセットを除去してロードを高速化"]
       ]]
 [:dt "2016/10/09 version 0.1.0 あほげー登録バージョン"]
 [:dd [:ul [:li "公開"]]]
 ]


(heading-2 "Resources" "利用ライブラリ、利用素材など")

[:p "(敬称略)"]

[:dl
 [:dt "ライブラリ類"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript" "ClojureScript")]
 [:dd (a-href-external "http://www.pixijs.com/" "pixi.js")]
 [:dt "フォント"]
 [:dd
  (a-href-external "http://jikasei.me/font/genshin/" "源真ゴシック")
  " ("
  (a-href-external "http://jikasei.me/font/genshin/#_7" "ライセンス詳細")
                   ")"]
 [:dt "企画、プログラミング、グラフィック、ＢＧＭ、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


;(heading-2 "Advice" "攻略のヒント")
;
;[:ul
; (li "点火中は姿勢制御機構が働き、自転速度が大きく低下します")
; (li "死亡確定ルートを把握し、そこに合流してしまわないように微調整しつつ"
;     "周回していきましょう")
; (li "非常に安定した周回ルートも存在しますが、"
;     "少しずつ重力源に近付き、最終的には脱出不可能な領域へと突入します。"
;     "そうなる前にルートを変更しましょう")
; ]


