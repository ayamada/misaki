; @layout post
; @nocache true
; @title アニマルクリスマス
; @version 1.0.2
; @comment version 1.0.2
; @date 2017/12/22

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
 "『"
 (a-href-external "https://adventar.org/calendars/2392"
                  "あほべんとかれんだー Advent Calendar 2017")
 "』"
 "21日目エントリー作品"
 "「アニマルクリスマス」取扱説明書ページです。")

;[:ul
; [:li "詳しい説明はあとで書きます。"]
; ]


;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")

[:ul [:li (a-href-external "https://game.nicovideo.jp/atsumaru/games/gm5442")]]



(heading-2 "History" "更新履歴")

[:dl
 [:dt "2017/12/22 version 1.0.2"]
 [:dd [:ul
       [:li "アツマールの音量変更APIに対応"]
       [:li "チャージ不可のタイミングでも照準が表示される場合があったので修正"]]]
 [:dt "2017/12/22 version 1.0.1"]
 [:dd [:ul
       [:li "チャージ時エフェクトを微調整"]
       [:li "照準を表示"]]]
 [:dt "2017/12/21 version 1.0.0"]
 [:dd [:ul [:li "公開"]]]
 ]


(heading-2 "Resources" "利用ライブラリ、利用素材など")


[:p "(敬称略)"]

[:dl
 [:dt "システム"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript"
                       "ClojureScript")]
 [:dd (a-href-external "http://www.pixijs.com/" "pixi.js")]
 [:dd
  [:div (a-href-external "http://tkool.jp/mv/" "RPGツクールMV")]
  [:dl [:dd
        [:div "RPGツクールMVプラグイン"]
        [:dl
         [:dd (a-href-external "https://github.com/triacontane/RPGMakerMV/blob/master/AutoLoad.js" "AutoLoad.js")]
         ]]]]]

[:dl
 [:dt "フォント"]
 [:dd
  (a-href-external "https://mplus-fonts.osdn.jp/index.html"
                   "mplus-1m-regular.ttf")
  " (M" [:sup "+"] " M Type-1 regular)"]]

[:dl
 [:dt "ＢＧＭ"]
 [:dd
  (a-href-external "http://commons.nicovideo.jp/search/tag/%E3%83%8B%E3%82%B3%E7%B4%A0%E6%9D%90" "ニコ素材")
  "より："
  [:ul
   [:li (a-href-external "https://commons.nicovideo.jp/material/nc82124"
                         "【ニコ素材】元気「喜劇」")]
   [:li (a-href-external "https://commons.nicovideo.jp/material/nc82128"
                         "【ニコ素材】元気「勝ったよ！」")]
   [:li (a-href-external "https://commons.nicovideo.jp/material/nc82135"
                         "【ニコ素材】元気「土曜日の午後」")]
   [:li (a-href-external "https://commons.nicovideo.jp/material/nc82152"
                         "【ニコ素材】元気「もう一発入魂！」")]
   [:li "加工：技情研ネット 山田"]]]
 [:dd "他：技情研ネット 山田"]
 ]

[:dl
 [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


;(heading-2 "Special thanks to" "")
;
;[:p
; "今回は"
; (a-href-external "https://game.nicovideo.jp/atsumaru/users/69028415"
;                  "へなぽこや")
; "さんに3D素材を作るツール等を教えてもらったりしました。"
; "ありがとうございます！"
; ]
;


