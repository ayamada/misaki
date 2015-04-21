; @layout  post
; @title   トミーパトロール
; @comment version 0.1.3
; @date 2015/04/20
; @nocache true

(def latest-version "0.1.3")

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p [:a {:href "http://ahoge.info/15/index.php#39"} "あほげー第15回"]
   "エントリー作品「トミーパトロール」紹介ページです。")

[:ul
 [:li "今回のあほげーのお題は「トミー」。トミーって何だ？"]
 [:li
  "結果的にタイトルにまでなってしまった個人的裏テーマは"
  "『自分の中のうろおぼえのムーンパトロールの自機』。"
  [:br]
  "どうしてこうなった感が非常に強い。半日ぐらい悩んだ結果がこれだよ！"
  "素直に、社名か人名にしとくべきだったか。"]]


(heading-2 "Play" "遊ぶ")
(p [:a {:href "/op0008/" :target "_blank"} "http://vnctst.tir.jp/op0008/"]
   " "
   "にて遊べます。")


(heading-2 "Staff" "製作者および利用素材など")

[:ul
 [:li "めんどいので大部分のリンクは省略してます。必要ならぐぐってください。"]]

[:dl
 [:dt "ライブラリ類"]
 [:dd "ClojureScript"]
 [:dd "pixi.js"]
 [:dd "webfont.js"]
 [:dd "howler.js"]
 [:dt "フォント"]
 [:dd (link "M+ 1M bold" "http://mplus-fonts.sourceforge.jp/")]
 [:dt "ＢＧＭ"]
 [:dd
  (link "ニコニコ自作ゲームフェス用ニコ素材"
        "http://commons.nicovideo.jp/user/upload/659862?t=audio")]
 [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "History" "更新履歴")
[:dl
 [:dt "2015/04/20 version 0.1.3"]
 [:dd "chromeでBGMがループしない問題を修正"]
 [:dd "safariでも動くようにする"]
 [:dd "ボス出現位置を少し近くする"]
 [:dt "2014/11/04 version 0.1.2 バランス調整"]
 [:dd "ジャンプ力と重力を変更"]
 [:dd "敵の速度を微調整"]
 [:dd "ダメージ時の無敵時間を延長"]
 [:dd "ボス出現位置を少し遠くする"]
 [:dd "ボスのHPを少し下げる"]
 [:dt "2014/11/02 version 0.1.1"]
 [:dd "ボタンを押してもすぐにアクションが実行されない時があったので、ボタンを押したら即座にアクションを実行するように直した"]
 [:dt "2014/11/02 version 0.1.0 あほげー参加バージョン"]
 [:dd "公開"]
 [:dd "公式ページ設置"]
 ]



