;; Define template options here
; @layout  default
; @title   VNCTST games


(defn page-header [[fs & rs] & [desc]]
  [:div
   [:div {:class "page-header"} [:h1 [:span fs] rs]]
   (if desc (p {:class "desc"} desc) "")
   ])


(header
  (:title site)
  "VNCTST games では、Android向け/デスクトップOS向けの"
  "各種のゲームおよびアプリを公開しています。"
  )

;; TODO: 以下の各見出しにidをつけて、目次を作成する


(page-header "Games" "ゲーム")
(ul [
     (link "ぶらり猫の旅　地底帝国編" "games/driftcat_underworld.html")
     (link "space drop" "games/space_drop.html")
     ])


(page-header "Applications" "アプリ")
(p "現在準備中")


(page-header "News" "更新情報")
(post-list)
;(prev-next-page-link)
(p "更新情報は、"
   (link "atom.xml" "atom.xml")
   "からも取得可能です(何らかのフィードリーダーを使ってください)。")


(page-header "Information" "関連情報など")
(ul [
     [:span "android版のゲーム/アプリは、"
      (link "Sony Tablet S" "http://www.sony.jp/tablet/products/S1/")
      "にて動作確認を行っています。"
      ]
     ])


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


