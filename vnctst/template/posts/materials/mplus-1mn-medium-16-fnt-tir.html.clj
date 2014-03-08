; @layout  post
; @title   mplus-1mn-medium-16-fnt-tir
; @comment 公開開始
; @date 2014/03/06
; @nocache true

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p "M+ 1mn medium を加工したfnt形式のビットマップフォントです。")
(p "詳細についてはgithubのプロジェクトページを参照してください。")


(heading-2 "Project Page")
(ul [
     [:span (link "https://github.com/ayamada/mplus-1mn-medium-16-fnt-tir")]
     ])

(heading-2 "Screenshot")

[:div
 [:img {:src "../img/mplus-1mn-medium-16-fnt-tir-ss.png" :alt "screenshot"}]]


