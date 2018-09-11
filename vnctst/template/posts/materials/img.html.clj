; @layout  post
; @title   Bitmap Images
; @comment 新たにページを作成
; @date 2018/07/07
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
  [:a {:href url, :target "_blank" :rel "noopener noreferrer"} (or label url)])

(defn li [& args] (apply vector :li args))


(p {:class "desc"} "ゲーム用画像")

[:ul
 [:li
  "ここでは、自作のゲーム用画像を公開します。"]
 [:li "ダウンロードリンクより、ブラウザからの右クリック等を使い保存してください。"]
 [:li
  "各画像のライセンスは、基本的には"
  (a-href-external "https://creativecommons.org/licenses/sa/2.0/jp/"
                   "CC SA 2.0 JP")
  "のライセンスとします。"
  [:br]
  "これは具体的には「権利者表記不要」「加工改変OK」「商用利用OK」「でも著作権は放棄してないよ」という扱いになります。"
  [:ul
   [:li [:small
         "これはほぼ"
         (a-href-external "https://creativecommons.org/publicdomain/zero/1.0/deed.ja" "CC0")
         "と同じなのですが、CC0だと著作権を放棄してしまう為、例えば"
         "「"
         [:q "自分が作った素材をCC0にしていたら、大手メディア会社○○の下請け会社××がこの素材を利用した作品を作成して○○へと納品した結果として、○○から『この素材は○○が権利を保有している、お前は使うな』と勝手に著作権を主張してきた"]
         "」"
         "というような事がもし起こった際に立場が弱くなってしまう恐れがあるので、このようにしています。なおCC-BYだと「権利者表記が必要」となり、これはこれで利用の手軽さが失われてしまうので避けています"]]]
  ]
 ]



[:div
 (h2 {:id "index"} "Index")
 (p {:class "desc"} "索引")]

(toc)

(heading-2 "Manga Flash Effect" "強いられエフェクト")
[:dl
 [:dt "概要"]
 [:dd
  "いわゆる「強いられているんだ！」エフェクトです。"
  [:br]
  "この画像を充分に拡大し、ランダム回転を毎フレーム行う事でそれらしく見えるでしょう。"
  [:br]
  "拡大して使われる性質上、かなり荒目の表示になります。"
  ]
 [:dt "表示確認兼ダウンロード"]
 [:dd (link "shiirare.png" "../material_img/shiirare.png")]
 [:dt "ライセンス"]
 [:dd "CC SA 2.0 JP"]
 [:dt "詳細情報"]
 [:dd "透過png"]
 [:dd "画像サイズは256x256"]
 ]


(heading-2 "Colorful Flat Square Buttons" "フラットタイプの四角ボタン")
[:dl
 [:dt "概要"]
 [:dd
  (a-href-external "http://pixijs.download/release/docs/PIXI.mesh.NineSlicePlane.html" "PIXIのNineSlicePlane")
  "仕様のボタン画像の詰め合わせです。"
  [:br]
  "(これは要は「"
  (a-href-external "https://dev.classmethod.jp/smartphone/android/android-ui-design-9-patch/" "androidの9-patch")
  "から、一番外側の位置指定部分を抜いたもの」みたいなものです)"
  [:br]
  "灰色、赤、緑、水色、紫の5カラーがあり、"
  "それぞれに対して「通常状態」「選択(ホバー)状態」「押された状態」の"
  "画像を用意してあります。"
  ]
 [:dt "表示確認兼ダウンロード"]
 [:dd (link "btn-flat.png" "../material_img/btn-flat.png")]
 [:dt "ライセンス"]
 [:dd "CC SA 2.0 JP"]
 [:dt "詳細情報"]
 [:dd "透過png"]
 [:dd "画像サイズは64x64"]
 [:dd "各ボタンのサイズは16x16、これが以下の配置で並んでいる"]
 [:dd
  "[灰通常][灰選択][灰押下][赤通常]"
  [:br]
  "[赤選択][赤押下][緑通常][緑選択]"
  [:br]
  "[緑押下][水通常][水選択][水押下]"
  [:br]
  "[紫通常][紫選択][紫押下]"
  ]
 [:dd "leftWidth, topHeight, rightWidth, bottomHeight の各値は全て「2」を指定"]
 ]





