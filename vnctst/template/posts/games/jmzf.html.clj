; @layout  post
; @title   ジョイメカズーフィロミィ
; @comment Android版リリース
; @date 2014/05/06
; @nocache true

(def latest-version "0.4.2")

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p [:a {:href "http://ahoge.info/"} "あほげー第13回"]
   "エントリー作品「ジョイメカズーフィロミィ」公開ページです。"
   [:br]
   "テーマは「動物園」。"
   [:br]
   "24時間徹夜のテンションでがんばって作った。"
   "その結果、遊ぶ方にも24時間徹夜のテンションが必要となった感がある。"
   )

[:ul [:li "略称は「フィロミィ」。「ジョイメカ」と呼ぶと某ゲームを指してしまうので注意。"]]

(heading-2 "Information" "情報")
(p "現在公開中のバージョンは "
   (link [:strong latest-version] "#History")
   " です。")
(p "twitterのハッシュタグは"
   " "
   [:a
    {:href "https://twitter.com/search?q=%23%E3%82%B8%E3%83%A7%E3%82%A4%E3%83%A1%E3%82%AB%E3%82%BA%E3%83%BC%E3%83%95%E3%82%A3%E3%83%AD%E3%83%9F%E3%82%A3&src=hash"}
    "#ジョイメカズーフィロミィ"]
   " "
   "です。"
   )


(heading-2 "Movie" "動画")
(ul [
     [:span (link "http://www.nicovideo.jp/watch/sm23494612") " (ニコ動)"]
     ;[:span (link "http://www.youtube.com/watch?v=E3f7Sc5aVA0") " (youtube)"]
     ])


(heading-2 "Download" "ダウンロード")
[:dl
 [:dt "Android版"]
 [:dd
  [:a {:href "https://play.google.com/store/apps/details?id=jp.tir.vnctst.op0004"}
   "https://play.google.com/store/apps/details?id=jp.tir.vnctst.op0004"
   [:br]
   [:img {:alt "Get it on Google Play" :src "http://developer.android.com/images/brand/en_generic_rgb_wo_45.png"}]]
  [:br]
  "※最近のART対応のAndroid端末では動きません"]
 [:dt "Windows版(要Javaインストール)"]
 [:dd "version-" latest-version "を" (link "tir.jpサーバからダウンロード" "http://vnctst.tir.jp/op0004/jmzf-0.4.2-win.zip") " (18M)"]
 [:dd "version-" latest-version "を" (link "dropboxサーバからダウンロード" "https://dl.dropboxusercontent.com/u/9755436/op0004/jmzf-0.4.2-win.zip") " (18M)"]
 [:dt "Windows以外デスクトップOS版(要Javaインストール)"]
 [:dd "version-" latest-version "を" (link "tir.jpサーバからダウンロード" "http://vnctst.tir.jp/op0004/jmzf-0.4.2-jar.zip") " (18M)"]
 [:dd "version-" latest-version "を" (link "dropboxサーバからダウンロード" "https://dl.dropboxusercontent.com/u/9755436/op0004/jmzf-0.4.2-jar.zip") " (18M)"]
 [:dd
  "※最近のMac上では動かないようです。"
  "対応するのも面倒なので、Macは非対応という事にしておきます。"]
 [:dt "過去のバージョン"]
 [:dd (link "アーカイブ一覧" "http://vnctst.tir.jp/op0004/?O=D")]
 ]


(heading-2 "Staff" "製作者および利用物など")
[:p "めんどいので重要なもののみ記載しています。それぞれのライセンスについてはリンクを辿ってください。"]
[:dl
 [:dt "利用フレームワーク/ライブラリ"]
 [:dd
  (link "CLAN" "https://github.com/ayamada/clan")
  ", "
  (link "libGDX" "http://libgdx.badlogicgames.com/")
  ", その他Java, Clojure用ライブラリいろいろ"]
 [:dt "フォント"]
 [:dd (link "mp1mm16tir" "https://github.com/ayamada/mplus-1mn-medium-16-fnt-tir")]
 [:dt "ＢＧＭ"]
 [:dd
  (link "ニコニコ自作ゲームフェス用ニコ素材"
        "http://commons.nicovideo.jp/user/upload/659862?t=audio")]
 [:dt "企画、プログラミング、グラフィック、写真撮影、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "History" "更新履歴")
[:dl
 [:dt "2014/05/06 version 0.4.2 Android版を公開"]
 [:dd
  [:ul
   [:li "Android版をデプロイ"]
   [:li "Ｇマシーン微調整"]
   [:li "「撮影」回りの微調整"]
   [:li "あちこちの処理の軽量化"]
   ]]
 [:dt "2014/04/21 version 0.4.0"]
 [:dd
  [:ul
   [:li "フォント表示をより綺麗にする"]
   [:li "「撮影」回りの微調整"]
   ]]
 [:dt "2014/04/15 version 0.3.0"]
 [:dd "重要な変更："
  [:ul
   [:li "「動物図鑑」実装"]
   ]]
 [:dd "軽微な変更："
  [:ul
   [:li "自動セーブ処理の軽量化"]
   [:li "作成動物総数を記録(現バージョンからのカウントとなります)"]
   [:li "tweetメッセージの変更"]
   ]]
 [:dd "表示上の変更："
  [:ul
   [:li "ステージ初回クリア時だけ表示されるテキストを追加"]
   [:li "エンディングメッセージを変更"]
   [:li "一部のBGMをループ加工"]
   [:li "ステージ間の接続部の見た目をスムーズに加工"]
   [:li "外出時の背景の解像度を落とし、リソース量を軽減"]
   [:li "左上に使用メモリ量とFPS値をこっそり表示"]
   [:li "Ｇマシーンの動作アクションを微調整"]
   ]]
 [:dt "2014/03/25 version 0.2.0"]
 [:dd
  [:ul
   [:li "設定画面を追加。データリセット、リサイズ許可、音量変更が可能に"]
   [:li "前回減らした後半ボス撃破ボーナスを少し増やす"]
   [:li "雑魚敵にHP表示をつけるのを忘れていたので追加"]
   [:li "音量初期値を50%に変更"]
   [:li "twitterボタンの文面を少し修正"]
   ]]
 [:dt "2014/03/24 version 0.1.0"]
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
 [:dt "2014/03/21 version 0.0.1 あほげー参加バージョン"]
 [:dd "公開"]
 [:dt "2014/03/21"]
 [:dd "公式ページ設置"]
 ]



