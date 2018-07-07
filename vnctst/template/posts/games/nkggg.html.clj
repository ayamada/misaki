; @layout post
; @nocache true
; @title ネコゴゴゴ
; @version 1.0.5
; @comment version 1.0.5
; @date 2018/06/10

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



(def main-author
  ;"技情研ネット 山田"
  "山田太郎山"
  )





(p {:class "desc"} "version: " (:version site) " (" (site->date site) ")")


;(p "新作ゲーム『ネコゴゴゴ』は"
;   (a-href-external "https://game.nicovideo.jp/atsumaru/" "RPGアツマール")
;   "にて後日公開予定です。しばらくお待ちください。"
;   )
;
;(p "("
;   "過去のゲームは"
;   " "
;   (a-href-external "https://indie-stream.net/userpage/vnctst_games")
;   " "
;   "に一覧があります"
;   ")")


;(p
; "『"
; (a-href-external "https://adventar.org/calendars/2392"
;                  "あほべんとかれんだー Advent Calendar 2017")
; "』"
; "21日目エントリー作品"
; "「アニマルクリスマス」取扱説明書ページです。")

;[:ul
; [:li "詳しい説明はあとで書きます。"]
; ]


;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")

[:ul [:li (a-href-external "https://game.nicovideo.jp/atsumaru/games/gm6759")]]



(heading-2 "History" "更新履歴")

[:dl
 [:dt "2018/06/10 version 1.0.5"]
 [:dd [:ul
       [:li "公開開始"]
       [:li "エンディング1までプレイ可能"]
       ]]
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
 [:dt "グラフィック"]
 [:dd main-author]
 [:dd (a-href-external "http://tkool.jp/mv/" "RPGツクールMV")]
 [:dd (a-href-external "https://www.sketchup.com/ja" "SketchUp")]
 ]

[:dl
 [:dt "ＢＧＭ"]
 [:dd (a-href-external "https://twitter.com/sankakusan" "チカンゴ")]
 ]

[:dl
 [:dt "効果音"]
 [:dd main-author]
 [:dd (a-href-external "http://tkool.jp/mv/" "RPGツクールMV")]
 ]

[:dl
 [:dt "フォント"]
; [:dd
;  (a-href-external "https://mplus-fonts.osdn.jp/index.html"
;                   "mplus-1m-regular.ttf")
;  " (M" [:sup "+"] " M Type-1 regular)"]
 [:dd
  (a-href-external "http://jikasei.me/font/genshin/" "源真ゴシック")
  " ("
  (a-href-external "http://jikasei.me/font/genshin/#_7" "ライセンス詳細")
                   ")"]
 ]

[:dl
 [:dt "企画、プログラミング、その他いろいろ"]
 [:dd main-author]
 ]

[:dl
 [:dt "友情出演"]
 [:dd
  "『魚類』"
  "("
  (a-href-external "http://hothukurou.firebird.jp/game/Blocks/index.html"
                   "世界くずし ～Breakout the world～")
  "より"
  ")"
  ]
 [:dd
  "『ぶらり猫』"
  "("
  (a-href-external "http://vnctst.tir.jp/ja/games/driftcat_underworld.html"
                   "ぶらり猫の旅　地底帝国編")
  "より"
  ")"
  ]
 ]



(heading-2 "Special thanks to" "")

[:p
 (a-href-external "http://ch.nicovideo.jp/indies-game/blomaga/ar1450171"
                  "ゲームクリエイターズキャンプ")
 "スタッフおよび参加者の皆様"
 ]



