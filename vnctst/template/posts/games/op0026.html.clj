; @layout post
; @nocache true
; @title わさび食べ放題
; @version 2.1.0
; @comment version 2.1.0
; @date 2018/09/12

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
 (a-href-external "http://ahoge.info/" "第22回あほげー")
 "エントリー作品"
 "「わさび食べ放題」取扱説明書ページです。")

[:ul
 [:li "お題は「グリーン」でした。"]
 ]




;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")

(p "アツマール版を公開しました。")

[:ul [:li (a-href-external "https://game.nicovideo.jp/atsumaru/games/gm4418")]]

(p "以下から旧バージョン(1.0.7)も遊べます。")

[:ul [:li (a-href-external "http://vnctst.tir.jp/op0026/")]]


(heading-2 "History" "更新履歴")

[:dl
 [:dt "2018/09/12 version 2.1.0"]
 [:dd [:ul
       [:li "アツマールランキング対応"]
       ]]
 [:dt "2017/11/23 version 2.0.2"]
 [:dd [:ul
       [:li "iOSで遊べない問題をきちんと修正"]
       ]]
 [:dt "2017/11/22 version 2.0.1"]
 [:dd [:ul
       [:li "iOSで遊べない問題を仮修正(不完全)"]
       ]]
 [:dt "2017/09/16 version 2.0.0"]
 [:dd [:ul
       [:li "アツマール用に改修"]
       ;[:li ""]
       ;[:li ""]
       ;[:li ""]
       ]]
 [:dt "2017/04/15 version 1.0.7"]
 [:dd [:ul
       [:li "edgeで常にロードエラーが出る問題を修正"]
       [:li "オーディオファイルのキャッシュが無効化されていたのを修正"]
       ;[:li ""]
       ;[:li ""]
       ;[:li ""]
       ]]
 [:dt "2017/03/22 version 1.0.6"]
 [:dd [:ul
       [:li "ローディング処理を改善"]
       [:li "非常に古いモバイル環境でのBGM再生処理を改善"]
       [:li "背景のスクロール速度を微調整"]
       ;[:li ""]
       ;[:li ""]
       ;[:li ""]
       ]]
 [:dt "2017/03/20 version 1.0.5"]
 [:dd [:ul
       [:li "モバイル環境にて、クリック判定が全体的におかしかった問題を修正"]
       [:li "ieにて、BGMが稀にループしなくなる問題を修正"]
       [:li "ieにて、稀にローディングが停止してしまう問題を起こりにくくする"]
       [:li "取説urlを開いた時に稀に重くなる問題を修正"]
       [:li "タイトル画面のボタン文字列を変更"]
       [:li "ツイート内のurlを、この取説ページのurlから実ゲームページのurlへと変更"]
       [:li "ツイートボタンを押した時のSEを設定し忘れていたので設定した"]
       ]]
 [:dt "2017/03/19 version 1.0.4"]
 [:dd [:ul [:li "使用しなかったアセットを除去してロードを高速化"]]]
 [:dt "2017/03/19 version 1.0.3"]
 [:dd [:ul [:li "移動アルゴリズムを改善"]]]
 [:dt "2017/03/19 version 1.0.2"]
 [:dd [:ul [:li "描画速度の遅い環境にて、異様に難しくなる問題を緊急修正"]]]
 [:dt "2017/03/19 version 1.0.1"]
 [:dd [:ul [:li "chromeにてツイートボタンの文字が表示されていなかった問題を緊急修正"]]]
 [:dt "2017/03/19 version 1.0.0"]
 [:dd [:ul [:li "公開"]]]
 ]


(heading-2 "Resources" "利用ライブラリ、利用素材など")

[:p "(敬称略)"]

[:dl
 [:dt "ライブラリ類"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript"
                       "ClojureScript")]
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


