; @layout  post
; @title   マウスを極力さわりたくないプログラマの為のUnity入門
; @comment ページ作成
; @date    2014/04/29
; @nocache true

(defn heading-2 [title & [id]]
  (let [id-true (or id title)]
    (h2 {:id id-true} title)))

;(p {:class "desc"} "お願い")

(p "…というタイトルの文書を"
   (link "http://doc.tir.ne.jp/devel/misc/unity")
   "に書きました。")

(p "上記文書にて動かしている必要最小限のスケルトンプロジェクトのデプロイ結果を"
   (link "http://vnctst.tir.jp/stash/unity0002/")
   "にて動かしています(全く大した内容ではないです)。")

(p "後日、簡単なブラウザゲームを作成する予定です。")



