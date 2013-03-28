;; Define template options here
; @layout  default
; @title   VNCTST games

;; Your own function in template
(defn page-header [[fs & rs] & [desc]]
  [:div {:class "page-header"}
   [:h1 [:span fs] rs]
   (if desc (p {:class desc}) [])
   ])

; Template is compiled with hiccup
(header
  (:title site)
  "VNCTST games では、Android向け/デスクトップOS向けの"
  "各種のゲームおよびアプリを公開しています。"
  )

;; Sample post tags
;(page-header "Sample tags")
;(tag-list)

;; Template source
;(page-header "Template source")
;[:p "you can highlight your code with "
; (link "google-code-prettify" "http://code.google.com/p/google-code-prettify/")]

(page-header "Games")
(ul [
     (link "ぶらり猫の旅　地底帝国編" "games/driftcat_underworld.html")
     (link "space drop" "games/space_drop.html")
     ])
; Markdown like format with "p" function
;(p "See " (link "http://liquidz.github.com/misaki/"))

;; Sample posts
(page-header "News")
(post-list)
;(prev-next-page-link)


(page-header "Information" "関連情報")
(p "あとでかきます")


(page-header "About this site" "このサイトについて")
(ul [
     [:span
      "VNCTST games のゲームは、"
      (link "技情研ネット" "http://tir.jp/")
      "が"
      (link "CLAN" "https://github.com/ayamada/clan")
      "を使い開発しています。"]
     [:span
      "このサイトでは、ウェブサイト構築システムとして"
      (link "misaki" "https://github.com/liquidz/misaki")
      "を使用しています。"]
     ])


(page-header "Contact" "連絡先")
(p "あとでちゃんとした連絡先を用意します…今のところは"
   (link "@rnkv" "https://twitter.com/rnkv")
   "におねがいします。")


