; @layout post
; @nocache true
; @title コロッケ食べ放題
; @version 3.0.1
; @comment version 3.0.1
; @date 2015/07/19

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
 (a-href-external "http://ahoge.info/" "第17回あほげー")
 "エントリー作品"
 "「コロッケ食べ放題」取扱説明書ページです。")

[:ul
 [:li "※セーブ機能はありません。"]
 ]


;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")
[:ul [:li (a-href-external "http://vnctst.tir.jp/op0012-4/")]]



(heading-2 "History" "更新履歴")
[:dl
 [:dt "2015/07/19 version 3.0.1"]
 [:dd [:ul
       (li "コロッケ出現/消滅にかかる時間を半分にする")
       (li "最初だけ終了ボタン等を隠しておく")
       (li "コロッケレベル等を可視化")
       (li "一部の効果音を変更")
       ]]
 [:dt "2015/07/19 version 3.0.0"]
 [:dd [:ul [:li "公開"]]]
 ]


(heading-2 "Resources" "利用ライブラリ、利用素材など")

[:dl
 [:dt "ライブラリ類"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript" "ClojureScript")]
 [:dd (a-href-external "http://www.pixijs.com/" "pixi.js")]
 [:dd (a-href-external "https://github.com/CyberAgent/boombox.js" "boombox.js")]
 [:dt "フォント"]
 [:dd (a-href-external "http://mplus-fonts.sourceforge.jp/" "M+ 1M bold")]
 [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]




