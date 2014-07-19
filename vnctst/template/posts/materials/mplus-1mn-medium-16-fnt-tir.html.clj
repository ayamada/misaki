; @layout  post
; @title   mp1mm16tir
; @comment スクリーンショット追加
; @date 2014/05/08
; @nocache true

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p "M+ 1m medium を加工したfnt形式のビットマップフォントです。"
   [:br]
   "(以前はM+ 1mn mediumベースでした)"
   )
(p "詳細についてはgithubのプロジェクトページを参照してください。")


(heading-2 "Project Page")
(ul [
     [:span (link "https://github.com/ayamada/mplus-1mn-medium-16-fnt-tir")]
     ])

(heading-2 "Screenshot")

[:div
 {:class "ss-box"}
 "↓現行版(mp1mm16tir)"
 [:br]
 [:img {:src "../img/mplus-1m-medium-16-fnt-tir-ss.png" :alt "screenshot"}]]

[:div
 {:class "ss-box"}
 "↓旧版(mp1mnm16tir)"
 [:br]
 [:img {:src "../img/mplus-1mn-medium-16-fnt-tir-ss.png" :alt "screenshot"}]]

[:div
 {:class "ss-box"}
 "↓Android実機(1280x800)でのスクリーンショット。大体二倍(32x32相当)の表示。"
 [:br]
 "↓でかい画像なのでリンク化した(クリックすると原寸表示される)。"
 [:br]
 [:a {:href "../img/mp1mm16tir-ss_01.png"}
  [:img {:src "../img/mp1mm16tir-ss_01.png" :width "320" :height "200"}]]]

[:div
 {:class "ss-box"}
 "↓四倍(64x64相当)表示。元が16x16な事を考えれば健闘していると思う。"
 [:br]
 [:img {:src "../img/mp1mm16tir-ss_02.png" :alt "screenshot"}]]


