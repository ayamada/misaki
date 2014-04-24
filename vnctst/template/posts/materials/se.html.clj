; @layout  post
; @title   Sound Effects
; @comment 作成
; @date 2014/04/22
; @nocache true

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p {:class "desc"} "効果音")

[:ul
 [:li
  "ここでは、外部サイトにて"
  (link "Public Domain" "http://ja.wikipedia.org/wiki/%E3%83%91%E3%83%96%E3%83%AA%E3%83%83%E3%82%AF%E3%83%89%E3%83%A1%E3%82%A4%E3%83%B3")
  "もしくは"
  (link "CC0" "http://sciencecommons.jp/cc0/about")
  "のライセンスで公開されている音源を加工して生成した効果音を公開します。"]
 [:li "各効果音のライセンスは元の音源に準じます。"]
 [:li "ダウンロードリンクより、ブラウザからの右クリック等を使い保存してください。"]
 ]


(heading-2 "Cash Register" "キャッシュレジスター音")
[:dl
 [:dt "概要"]
 [:dd
  "昔の商店で使われていた、キャッシュレジスター機械の動作音です。"
  [:br]
  "今や機械自体はどこにも見掛けませんが、"
  "商取引効果音としてのミームは現在でも生きているのです。"]
 [:dt "ソース"]
 [:dd
  (link "http://www.freesound.org/people/SoundCollectah/sounds/108278/")
  [:br]
  (link "http://www.freesound.org/people/Zott820/sounds/209578/")]
 [:dt "生成手順概要"]
 [:dd "上記ソースより音量調整を行った上で一部を切り出し合成"]
 [:dt "ライセンス"]
 [:dd "CC0"]
 [:dt "試聴兼ダウンロード"]
 [:dd (link "buy.ogg" "../se/buy.ogg")]
 ]


(heading-2 "Shutter Sound" "カメラのシャッター音")
[:dl
 [:dt "概要"]
 [:dd "機械式シャッター機構を持つタイプのカメラの撮影音です。"]
 [:dt "ソース"]
 [:dd (link "http://www.freesound.org/people/uEffects/sounds/207865/")]
 [:dt "生成手順概要"]
 [:dd "上記ソースより音量調整を行った上で一部を切り出す"]
 [:dt "ライセンス"]
 [:dd "CC0"]
 [:dt "試聴兼ダウンロード"]
 [:dd (link "shutter.ogg" "../se/shutter.ogg")]
 ]


