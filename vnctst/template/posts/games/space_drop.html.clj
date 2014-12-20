; @layout  post
; @title   space drop
; @comment youtubeリンク追加
; @date 2013/04/27
; @nocache true


(p "space dropは、"
   (link "CLAN" "https://github.com/ayamada/clan")
   "付属のサンプルゲームです。")
(p "壺を操作して、"
   "上から降ってくるアイテムを取ったり取らなかったりします。")
(p "アイテムを取ると右下の取得数が増えますが、"
   "増えても別にいい事はありません。避けてもいいです。")
(p "ゲームオーバーはありません。また取得数は自動セーブされます。")
(p "技術デモ的側面の強いクソゲーです。")


[:h2 "Movie"]
(ul [[:span (link "http://www.youtube.com/watch?v=oR-fVowVQwA") " (youtube)"]
     [:span (link "http://www.nicovideo.jp/watch/sm20266312") " (ニコ動)"]
     ])


[:h2 "Download"]
[:dl
 [:dt "Android版"]
 [:dd
  [:a {:href "https://play.google.com/store/apps/details?id=jp.ne.tir.drop.android"}
   "https://play.google.com/store/apps/details?id=jp.ne.tir.drop.android"
   [:br]
   [:img {:alt "Get it on Google Play" :src "http://developer.android.com/images/brand/en_generic_rgb_wo_45.png"}]]
  [:br]
  "※最近のART対応のAndroid端末では動きません"]
 [:dt "Windows版(要Javaインストール)"]
 [:dd (link "https://dl.dropbox.com/u/9755436/drop/drop-1.0.4-windows.zip")]
 [:dt "Windows以外デスクトップOS版(要Javaインストール)"]
 [:dd (link "https://dl.dropbox.com/u/9755436/drop/drop-1.0.4-jar.zip")]
 [:dd
  "※最近のMac上では動かないようです。"
  "対応するのも面倒なので、Macは非対応という事にしておきます。"]
 ]


[:h2 "History"]
[:dl
 [:dt "2013/04/27"]
 [:dd "youtube動画リンク追加"]
 [:dt "2013/03/25"]
 [:dd "公式ページ設置"]
 [:dt "2013/03/08 version 1.0.4"]
 [:dd "LICENSEボタンを大きくし、ボタンレイアウトを変更"]
 [:dd "CLANを0.0.3-EXPERIMENTALに、Clojureを1.5.0にバージョンアップ"]
 [:dt "2013/03/06 version 1.0.3"]
 [:dd "URLを開く前に確認を行うようにした"]
 [:dt "2013/03/05 version 1.0.2"]
 [:dd "公開開始"]
 ]


