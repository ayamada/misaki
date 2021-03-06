; @layout post
; @nocache true
; @title 人文字X
; @version 1.0.2
; @comment version 1.0.2
; @date 2017/11/06

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
 (a-href-external "http://ahoge.info/" "第24回あほげー")
 "参加作品"
 "「人文字X」取扱説明書ページです。")

;[:ul
; [:li "詳しい説明はあとで書きます。"]
; ]


;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")

[:ul [:li (a-href-external "https://game.nicovideo.jp/atsumaru/games/gm4927")]]



(heading-2 "History" "更新履歴")

[:dl
 [:dt "2017/11/06 version 1.0.2"]
 [:dd [:ul
       [:li "過去のコメントが表示されなくなる問題を緊急修正"]
       ]]
 [:dt "2017/11/06 version 1.0.1"]
 [:dd [:ul
       [:li "アツマールのスクリーンショットボタンからスクリーンショットが取れない問題を修正"]
       [:li "エンディング回りを微修正"]
       ]]
 [:dt "2017/11/04 version 1.0.0"]
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
 [:dt "企画、プログラミング、グラフィック、ＢＧＭ、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "Special thanks to" "")

[:p
 "今回は"
 (a-href-external "https://game.nicovideo.jp/atsumaru/users/69028415"
                  "へなぽこや")
 "さんに3D素材を作るツール等を教えてもらったりしました。"
 "ありがとうございます！"
 ]



