; @title  VNCTST games
; @format html5

[:head
 [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
 [:meta {:charset (:charset site)}]
 (when (:nocache site)
   [:meta {:http-equiv "Pragma" :content "no-cache"}])
 (when (:nocache site)
    [:meta {:http-equiv "Cache-Control" :content "no-cache"}])
 [:meta {:name    "viewport"
         :content "width=device-width, initiali-scale=1.0, user-scalable=yes"}]

 [:title
  (if (= (:title site) (:site-title site))
    (:site-title site)
    (str (:site-title site) " - " (:title site)))]

 [:link {:rel   "shortcut icon"
         :href  "/favicon.ico"}]
 [:link {:href  "/ja/atom.xml"
         :rel   "alternate"
         :title (:title site)
         :type  "application/atom+xml"}]

 (css ["/ja/css/prettify.css" (:css site ())])
 (css {:media "only screen and (max-device-width:480px)"} (:device-css site))]
; /head

[:body

 ; github ribbon
 ;(github-ribbon "https://github.com/liquidz/misaki")

 (container
  contents

  [:hr]
  (footer
    (link "VNCTST games" "http://vnctst.tir.jp/ja/")
    ;(link (str "@" (:twitter site)) (str "http://twitter.com/" (:twitter site)))
    ;"&nbsp; 2013"
    ))
 ; /container

 (js ["/ja/js/prettify.js"
      "/ja/js/lang-clj.js"
      (:js site ())])]
; /body
