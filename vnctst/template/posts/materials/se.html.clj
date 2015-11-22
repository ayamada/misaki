; @layout  post
; @title   Sound Effects
; @comment 着地音を追加
; @date 2015/09/26
; @nocache true

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

(defn a-href [url & [label]]
  [:a {:href url} (or label url)])

(defn a-href-external [url & [label]]
  [:a {:href url, :target "_blank"} (or label url)])

(defn li [& args] (apply vector :li args))


(p {:class "desc"} "効果音")

[:ul
 [:li
  "ここでは、外部サイトにて"
  (a-href-external "http://ja.wikipedia.org/wiki/%E3%83%91%E3%83%96%E3%83%AA%E3%83%83%E3%82%AF%E3%83%89%E3%83%A1%E3%82%A4%E3%83%B3" "Public Domain")
  "もしくは"
  (a-href-external "https://creativecommons.org/choose/zero/?lang=ja" "CC0")
  "のライセンスで公開されている音源を加工して生成した効果音を公開します。"]
 [:li "各効果音のライセンスは元の音源に準じます。"]
 [:li "ダウンロードリンクより、ブラウザからの右クリック等を使い保存してください。"]
 ]



[:div
 (h2 {:id "index"} "Index")
 (p {:class "desc"} "索引")]

(toc)



(heading-2 "Landing Sound" "着地音")
[:dl
 [:dt "概要"]
 [:dd "靴を履いた人が、高所から着地した際の音です。"]
 [:dt "試聴兼ダウンロード"]
 [:dd (link "landing.ogg" "../se/landing.ogg")]
 [:dt "ライセンス"]
 [:dd "CC0"]
 [:dt "ソース"]
 [:dd (a-href-external "http://freesound.org/people/mlsulli/sounds/234855/")]
 [:dt "生成手順概要"]
 [:dd "上記ソースより編集"]
 ]


(heading-2 "Hinge Sounds" "蝶番音")
[:dl
 [:dt "概要"]
 [:dd
  "宝箱や扉など、蝶番の付いた設置物を開いた時の音です。"
  [:br]
  "木製と金属製の二種類を用意しました。"]
 [:dt "試聴兼ダウンロード"]
 [:dd (link "open-wood.ogg" "../se/open-wood.ogg")
  " - 木製の扉や箱など"]
 [:dd (link "open-metal.ogg" "../se/open-metal.ogg")
  " - 金属製の扉や箱など"]
 [:dt "ライセンス"]
 [:dd "CC0"]
 [:dt "ソース"]
 [:dd
  (a-href-external "http://freesound.org/people/ToniTobe/sounds/233292/")
  [:br]
  (a-href-external "http://freesound.org/people/Ryding/sounds/125957/")
  [:br]
  (a-href-external "http://freesound.org/people/kyles/sounds/51805/")]
 [:dt "生成手順概要"]
 [:dd "(省略)"]
 ]


(heading-2 "Cash Register" "キャッシュレジスター音")
[:dl
 [:dt "概要"]
 [:dd
  "昔の商店で使われていた、キャッシュレジスター機械の動作音です。"
  [:br]
  "今や機械自体はどこにも見掛けませんが、"
  "商取引効果音としてのミームは現在でも生きているのです。"]
 [:dt "試聴兼ダウンロード"]
 [:dd (link "buy.ogg" "../se/buy.ogg")
  " - 最初に作ったもの。音量でかい。"]
 [:dd (link "buy2.ogg" "../se/buy2.ogg")
  " - ローパスフィルタにかけ、少しくぐもった感じにしたもの。普通の音量。"]
 [:dt "ライセンス"]
 [:dd "CC0"]
 [:dt "ソース"]
 [:dd
  (a-href-external "http://www.freesound.org/people/SoundCollectah/sounds/108278/")
  [:br]
  (a-href-external "http://www.freesound.org/people/Zott820/sounds/209578/")]
 [:dt "生成手順概要"]
 [:dd "上記ソースより音量調整を行った上で一部を切り出し合成"]
 ]


(heading-2 "Shutter Sound" "カメラのシャッター音")
[:dl
 [:dt "概要"]
 [:dd "機械式シャッター機構を持つタイプのカメラの撮影音です。"]
 [:dt "試聴兼ダウンロード"]
 [:dd (link "shutter.ogg" "../se/shutter.ogg")]
 [:dt "ライセンス"]
 [:dd "CC0"]
 [:dt "ソース"]
 [:dd (a-href-external "http://www.freesound.org/people/uEffects/sounds/207865/")]
 [:dt "生成手順概要"]
 [:dd "上記ソースより音量調整を行った上で一部を切り出す"]
 ]


