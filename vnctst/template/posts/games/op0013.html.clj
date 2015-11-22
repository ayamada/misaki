; @layout post
; @nocache true
; @title フェムトプレゼンター
; @version 0.1.1
; @comment version 0.1.1
; @date 2015/11/22

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
 (a-href-external "http://ahoge.info/18/index.php#52" "第18回あほげー")
 "エントリー作品"
 "「フェムトプレゼンター」取扱説明書ページです。")

[:ul
 [:li "FF6にプレゼンターという敵がいたなあと思って作ってみたものの、あとで確認したらかなり違ってた。"]
 ]


;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)



(heading-2 "Play" "遊ぶ")

[:ul [:li (a-href-external "http://vnctst.tir.jp/op0013/")]]



(heading-2 "History" "更新履歴")

[:dl
 [:dt "2015/11/22 version 0.1.1"]
 [:dd [:ul [:li "倍率を厳密に表示するようにした"]]]
 [:dt "2015/11/22 version 0.1.0 あほげー登録バージョン"]
 [:dd [:ul [:li "公開"]]]
 ]


(heading-2 "Resources" "利用ライブラリ、利用素材など")

[:dl
 [:dt "ライブラリ類"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript" "ClojureScript")]
 [:dd (a-href-external "http://www.pixijs.com/" "pixi.js")]
 [:dd (a-href-external "https://github.com/CyberAgent/boombox.js" "boombox.js")]
 [:dt "フォント"]
 [:dd (a-href-external "http://www.google.com/get/noto/#/family/noto-sans-jpan" "NotoSansCJKjp-Black")]
 [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]



