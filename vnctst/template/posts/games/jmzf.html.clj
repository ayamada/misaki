; @layout  post
; @title   ジョイメカズーフィロミィ
; @comment 0.2.0 リリース
; @date 2014/03/25
; @nocache true

(def latest-version "0.2.0")

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p [:a {:href "http://ahoge.info/13/index.php#28"} "あほげー第13回"]
   "エントリー作品「ジョイメカズーフィロミィ」公開ページです。"
   [:br]
   "テーマは「動物園」。"
   [:br]
   "24時間徹夜のテンションでがんばって作った。"
   "その結果、遊ぶ方にも24時間徹夜のテンションが必要となった感がある。"
   )
(p "ブラゲじゃなくてごめんなさい。"
   "遊ぶのめんどくさいという人のために、あとで動画用意します。")


(heading-2 "Information")
(p "現在公開中のバージョンは " [:strong latest-version] " です。")
(p "詳細については、付属のreadme.txtを読んでください。")
(p "twitterのハッシュタグは"
   " "
   [:a
    {:href "https://twitter.com/search?q=%23%E3%82%B8%E3%83%A7%E3%82%A4%E3%83%A1%E3%82%AB%E3%82%BA%E3%83%BC%E3%83%95%E3%82%A3%E3%83%AD%E3%83%9F%E3%82%A3&src=hash"}
    "#ジョイメカズーフィロミィ"]
   " "
   "です。"
   )


(heading-2 "Movie")
(ul [
     ;[:span (link "http://www.youtube.com/watch?v=E3f7Sc5aVA0") " (youtube)"]
     ;[:span (link "http://www.nicovideo.jp/watch/sm23000695") " (ニコ動)"]
     [:span "準備中"]
     ])


(heading-2 "Download")
[:dl
 [:dt "Android版"]
 [:dd "準備中"]
 [:dt "Windows版(要Javaインストール)"]
 [:dd "version-" latest-version "を" (link "tir.jpサーバからダウンロード" "http://vnctst.tir.jp/op0004/jmzf-0.2.0-win.zip") " (20M)"]
 [:dd "version-" latest-version "を" (link "dropboxサーバからダウンロード" "https://dl.dropboxusercontent.com/u/9755436/op0004/jmzf-0.2.0-win.zip") " (20M)"]
 [:dt "Windows以外デスクトップOS版(要Javaインストール)"]
 [:dd "version-" latest-version "を" (link "tir.jpサーバからダウンロード" "http://vnctst.tir.jp/op0004/jmzf-0.2.0-jar.zip") " (20M)"]
 [:dd "version-" latest-version "を" (link "dropboxサーバからダウンロード" "https://dl.dropboxusercontent.com/u/9755436/op0004/jmzf-0.2.0-jar.zip") " (20M)"]
 [:dt "過去のバージョン"]
 [:dd (link "アーカイブ一覧" "http://vnctst.tir.jp/op0004/?O=D")]
 ]


(heading-2 "License")
[:div
 "めんどいので、あとでまとめます。"]


(heading-2 "TODO" "今後の開発予定")
(p "めんどくさくなったらやらないかも")
(ul [
     [:span "プレイ動画作成"]
     [:span "演出の強化(パーティクル追加等)"]
     [:span "android版のビルドと公開"]
     [:span "ストーリーを考える"]
     [:span "ストーリーイベントの追加"]
     [:span "ステージ間デモとエンディングをつくる"]
     [:span "チュートリアル中に金がなくなった時の救済処理"]
     ])

(heading-2 "History")
[:dl
 [:dt "2013/03/25 version 0.2.0"]
 [:dd
  [:ul
   [:li "設定画面を追加。データリセット、リサイズ許可、音量変更が可能に"]
   [:li "前回減らした後半ボス撃破ボーナスを少し増やす"]
   [:li "雑魚敵にHP表示をつけるのを忘れていたので追加"]
   [:li "音量初期値を50%に変更"]
   [:li "twitterボタンの文面を少し修正"]
   ]]
 [:dt "2013/03/24 version 0.1.0"]
 [:dd "重要な変更："
  [:ul
   [:li "後半面ボスの撃破ボーナスがあまりにも気前良すぎたので減らす"]
   [:li "動物およびボスのHPを表示"]
   [:li "Ｇマシーン拡張ボタンの表示条件を変更 / 更なるＧマシーンの拡張を可能に"]
   [:li "動物の数が十分に多い時の戦闘処理を少し変更"]
   ]]
 [:dd "軽微な変更："
  [:ul
   [:li "全滅時に帰還ダイアログは出さない"]
   [:li "ステージボス順を変更 / ステージ毎に背景を個別に設定"]
   [:li "「twitter」「タイトルに戻る」「配布元サイト」等のボタンを追加"]
   [:li "特定状況にて動物の配置が偏る問題を修正"]
   ]]
 [:dd "表示上の変更："
  [:ul
   [:li "作成済動物を開発室に表示"]
   [:li "各種のウィンドウ、ダイアログ、ボタンの表示および位置を改善"]
   ]]
 [:dt "2013/03/21 version 0.0.1 (あほげー参加バージョン)"]
 [:dd "公開"]
 [:dt "2014/03/21"]
 [:dd "公式ページ設置"]
 ]



