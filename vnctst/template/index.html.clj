;; Define template options here
; @layout  default
; @title   VNCTST games
; @nocache true


(defn page-header [[fs & rs] & [desc]]
  [:div
   [:div {:class "page-header"} [:h1 [:span fs] rs]]
   (if desc (p {:class "desc"} desc) "")
   ])

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])

(header
  (:title site)
  "VNCTST games では、"
  "各種のゲームおよびアプリを公開しています。"
  )

;[:div
; {:style "text-align:center"}
; [:img {:src "img/dc_badge.png" :alt "badge"}]]

;; TODO: 以下の各見出しにidをつけて、目次を作成する

(page-header "News" "更新情報")
(post-list)
;(prev-next-page-link)
(p "更新情報は、"
   " http://vnctst.tir.jp/ja/atom.xml "
   ;(link "http://vnctst.tir.jp/ja/atom.xml" "atom.xml")
   "からも取得可能です(何らかのフィードリーダーを使ってください)。")


(page-header "Games" "ゲーム")
[:ul [:li
      "完成したゲームの一覧は、"
      (link "Indie Stream内VNCTST gamesページ"
            "https://indie-stream.net/userpage/vnctst_games")
      "に移動しました。"]]

;[:p "開発一時中止中の(未完成の)ゲームについて"]
;
;[:dl
; [:dt "ぶらり猫#2(森探検編)"]
; [:dd "ドット絵風の森背景パーツおよびキャラグラフィック等のアセットの用意段階で一時中断状態。もうドット絵風にするのは諦めるべきか？"]
; [:dt "宅ドラ本編"]
; [:dd "仲間キャラ各種の顔アイコンの洗練が必要"]
; [:dd "アイテム、敵、背景の各グラフィックを、自宅写真から切り出して加工する作業が予想以上に面倒で一時中断状態"]
; ]
;
;[:p "全体的に、グラフィックアセットの用意がボトルネックになっている為、これらに対する根本的な解決策を得なくてはならない。"]


(page-header "Applications" "アプリ")
(ul [
     "現在作成停止中"
     ])


(page-header "Materials" "配布素材")
(ul [
     (link "Sound Effects 効果音"
           "materials/se.html")
     (link "mp1mm16tir ビットマップフォント"
           "materials/mplus-1mn-medium-16-fnt-tir.html")
     ])


(page-header "Information" "関連情報など")

(heading-2 "Policy" "VNCTST gamesの方針")
(p "これらは基本方針というだけなので、方針に従っていないケースも普通にあります。")
[:ul [:li [:dl
           [:dt "Create a browser game - ブラゲつくる"]
           [:dd "元々の方針は『PC/モバイルどちらでも遊べるようにする』だった。"]
           [:dd "しかし時間の経過と共に、Google Playでの公開に必要な手順がどんどん増加して手間になり、これらが今後に軽減されるような事はなさそうな為、手順の省力化の為に、以下の方針に改める事とした。"]
           [:dd
            [:ol
             [:li "とりあえずPCでもモバイルでも動く、html5ベースのブラゲとして作って普通に公開する。Google PlayやAppStoreには(まだ)置かない。"]
             [:li "それが充分に人気を集めて需要があり、その上でPC/モバイルアプリとしてリリースする意味があるようであれば、node-webkitやapache cordovaを使ってPC/Android/iOS向けのデプロイを行う事を検討する。"]]]
           ]]]
[:ul [:li [:dl
           [:dt "No ads - 広告なし"]
           [:dd "「広告」とは「コンテンツに添加物を注入する」ようなものであると考えているので、基本的には行わない方向とする。"]
           [:dd "利益を上げたい場合は、広告以外の手法(有料販売など)をとる事とする。"]
           [:dd "ただし、単純な広告ではなく、元コンテンツを盛り上げる効果のある内容(コラボその他)の場合は対応してもよい。"]
           ]]]
[:ul [:li [:dl
           [:dt "Games are NOT open-source - ゲームはソース非公開"]
           [:dd "ゲームのソースコードが公開されている場合、たとえプレイヤーにソースコードを読んだりする気が全く無くても「ソースコードが公開されてるのか、じゃあ分かる人が見たら何でも丸わかりなのか…」と思われ、それによってある種の神秘性が損なわれ、そのゲームの面白さ度が減少してしまう、と考えている為。"]
           [:dd "ただし、これは多数のプレイヤーに対しての話なので、特定個人や(少人数の)特定グループにだけ公開するような事であれば全く問題ない。"]
           [:dd "アプリにはそんな神秘性など全く不要なので、利用者の利便を考えソースコードは普通に公開する。"]
           [:dd "また、ゲーム内で利用している個別の自作ライブラリの類もアプリと同様、ソースコード公開対象とする(ゲームの神秘性は別に損なわれない為)。"]
           ]]]
[:ul [:li [:dl
           [:dt "etc. - その他"]
           [:dd "思い付き次第追加する予定。"]
           ]]]

(def banner-url "http://vnctst.tir.jp/ja/img/banner.png")

(heading-2 "About" "いろいろ")
[:ul
 ;[:li
 ; [:div
 ;  "このサイトでは、ウェブサイト構築システムとして"
 ;  (link "misaki" "https://github.com/liquidz/misaki")
 ;  "をカスタマイズし使用しています。"]
 ; [:ul [:li
 ;       "あまりきちんとコードを管理はしてないですが、 "
 ;       (link "https://github.com/ayamada/misaki"
 ;             "https://github.com/ayamada/misaki")
 ;       " にカスタマイズ内容およびテンプレートそのものを"
 ;       "保存しています。"]]]
 [:li
  "以下は VNCTST games のバナーです。"
  "リンクの際にお使いください。"
  [:br]
  [:img {:src banner-url :alt "バナー画像"}]
  [:br]
  "( " [:code banner-url] " )"
  [:br]
  "あとでもっとマシなバナーに作り直します。あとで。"
  ]
 ;[:li
 ; "もし VNCTST games 作成のゲーム/アプリを気に入ってもらえたなら、"
 ; "よろしければ、こちらの"
 ; (link "お願い" "misc/amazon.html")
 ; "の方にご協力をおねがいします。"
 ; ]
 ]


(heading-2 "Contact" "連絡先")
(ul [
     [:span "メールアドレス： " [:code "uint4096 ＠ gmail.com"]]
     [:span
      "※メールがスパム判定された場合に山田が気付かない場合があります。"
      "返事が来ない場合は "
      (link "@rnkv" "https://twitter.com/rnkv")
      " まで連絡をおねがいします。"]
     ])


