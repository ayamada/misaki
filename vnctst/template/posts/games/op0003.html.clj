; @layout  post
; @title   自宅＆ドラゴンズ(仮題)
; @comment デモ版更新
; @date 2014/03/06
; @nocache true

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p "ニコニコ自作ゲームフェス3参加作品「自宅＆ドラゴンズ(仮題)」公開ページです。"
   [:br]
   "略称は「宅ドラ」でおねがいします。")
(p "現在整備中。詳細については後で書きます。今はニコ動の解説を見てください。")


(heading-2 "Movie")
(ul [
     ;[:span (link "http://www.youtube.com/watch?v=E3f7Sc5aVA0") " (youtube)"]
     [:span (link "http://www.nicovideo.jp/watch/sm23000695") " (ニコ動)"]
     ])


(heading-2 "Download")
[:dl
 [:dt "Android版"]
 [:dd "準備中(デモ版の内は作らない予定)"]
 [:dt "Windows版(要Javaインストール)"]
 [:dd "windows向けデモ版(0.0.2-demo 27M)"
  (ul [[:a {:href "http://vnctst.tir.jp/op0003/op0003-0.0.2-demo-win.zip"} "tir.jpサーバからダウンロード"]
       [:a {:href "https://dl.dropboxusercontent.com/u/9755436/op0003/op0003-0.0.2-demo-win.zip"} "dropbox.comサーバからダウンロード(予備)"]])]
 [:dt "Windows以外デスクトップOS版(要Javaインストール)"]
 [:dd "mac/linux向けデモ版(0.0.2-demo 27M)"
  (ul [[:a {:href "http://vnctst.tir.jp/op0003/op0003-0.0.2-demo-jar.zip"} "tir.jpサーバからダウンロード"]
       [:a {:href "https://dl.dropboxusercontent.com/u/9755436/op0003/op0003-0.0.2-demo-jar.zip"} "dropbox.comサーバからダウンロード(予備)"]])]
 ]


;(heading-2 "License")
;[:ul [:li [:a {:href "driftcat_underworld_license.html"}
;           "driftcat_underworld_license.html"]]]


(heading-2 "TODO" "今後の開発予定")
(ul [
     [:span "設定項目の追加(音量調整等)"]
     [:span "武器/装備品の追加"]
     [:span "敵アイテムドロップの追加"]
     [:span "マップパーツ/部屋/NPCの追加"]
     [:span "新しい敵およびトラップ類の追加"]
     [:span "実績の追加"]
     [:span "OP/EDの追加"]
     ])

(heading-2 "History")
[:dl
 [:dt "2014/03/06 version 0.0.2-DEMO"]
 [:dd "オブジェクトが重なった際のターゲッティング優先順位が稀に奥側優先になる時がある問題を修正"]
 [:dd "ターゲッティング可能範囲を少し縮める"]
 [:dd "最初の横道を短くして明るくし、奥が行き止まりである事が一目で分かるようにする"]
 [:dd "オブジェクト出現テーブルを少し調整"]
 [:dd "実績を一つ追加"]
 [:dd "ドア出入りのフェードをより分かりやすく変更"]
 [:dd "一部のメッセージの表示色と時間を変更"]
 [:dt "2014/03/02 version 0.0.1-DEMO"]
 [:dd
  "5分でゲーム内容が一通り理解できるデモ版を公開"
  [:br]
  "(後日、それなりにボリュームのある形での公開を準備中です)"
  ]
 [:dt "2014/03/01"]
 [:dd "公式ページ設置"]
 ]



