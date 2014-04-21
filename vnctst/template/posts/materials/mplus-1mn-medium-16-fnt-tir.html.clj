; @layout  post
; @title   mp1mm16tir
; @comment 更新
; @date 2014/04/20
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
 [:img {:src "../img/mplus-1m-medium-16-fnt-tir-ss.png" :alt "screenshot"}]]
[:div
 [:img {:src "../img/mplus-1mn-medium-16-fnt-tir-ss.png" :alt "screenshot"}]]


