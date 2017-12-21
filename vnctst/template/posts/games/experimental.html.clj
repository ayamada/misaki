; @layout post
; @nocache true
; @title 実験作一覧
; @comment op0029追加
; @date 2017/09/01

(defn site->date [site]
  (let [dtf (org.joda.time.format.DateTimeFormat/forPattern "yyyy/MM/dd")]
    (.print dtf (:date site))))

(defn a-href [url & [label]]
  [:a {:href url} (or label url)])

(defn a-href-external [url & [label]]
  [:a {:href url, :target "_blank" :rel "noopener noreferrer"} (or label url)])

(defn li [& args] (apply vector :li args))


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




(p "実験的な内容の作品の一覧です。"
   "基本的に、遊んで面白いゲームではありません。")




;[:div
; (h2 {:id "toc"} "Table of Contents")
; (p {:class "desc"} "目次")]
;
;(toc)





(heading-2 "Experimental games" "実験作")

(p "上の方が最近で、下の方が古いです")

[:div [:br]]

;;;

[:h3 (a-href-external "http://banker.tir.jp/op0029/"
                      "試作サイドビューアクションゲーム(仮題)")]

[:ul
 [:li "RPGを目指して作っていたのだが、全然RPGっぽくならなかったので一旦中断したもの。"]
 [:li "そのうち将来に再開する予定。"]
 [:li "なお試作段階の為、キューブを全部集めても何も起こらない。別の猫は何もしない。ドアにも入れない。"]
 ]

;;;

[:h3 (a-href "op0025.html" "ドラフトランドの冒険")]

[:ul
 [:li
  (a-href-external "http://www.adventar.org/calendars/1653"
                   "あほべんとかれんだー Advent Calendar 2016")
  "参加作品。"]
 [:li "クリスマスを迎える準備をする為に、異世界を探検するゲーム。"]
 [:li "…を目指していたのだが途中で力尽きた。"]
 [:li
  "労力のほとんどが、大量の絵を用意する部分に費されている"
  "(しかし絵の品質は非常に粗悪)。"]
 ]

;;;

[:h3 (a-href-external "http://banker.tir.jp/op0023/"
                      "試作迷路ゲーム(仮題)")]

[:ul
 [:li "迷路の自動生成アルゴリズムを試しに作ってみたもの。"]
 [:li
  "うろおぼえだが、確か「ドルアーガの塔みたいな迷路」"
  "のようなリクエストに対して作ったような気がするのだが、"
  "できた結果は「迷宮寺院ダババみたいな迷路」になってしまった。"
  ]
 [:li
  "「迷路は、いやな敵に追われたり、"
  "うれしいものを拾ったりする要素がないとつまらない」"
  "という結論が出た。"]
 ]

;;;

[:h3 (a-href-external "http://banker.tir.jp/op0021/"
                      "試作横スクロール")]

[:ul
 [:li
  (a-href-external "https://twitter.com/rnkv/status/780351542041784320")
  " のように考えて試作したもの。"
  "ゲームではない。"]
 ]

;;;

[:h3 (a-href-external "http://banker.tir.jp/op0020/"
                      "はりつけマン")]

[:ul
 [:li
  "とてもやる気のない時に"
  "「動けない主人公」というアイデアをもらったので、"
  "そのまま実装してみたゴミ。"]
 ]

;;;

[:h3 (a-href-external "/op0019-2/"
                      "フィロミス")]

[:ul
 [:li
  "前回の「いか工船」を反省した結果は下に書いているような内容なのだが、"
  "「パズルゲームなら、別にキャラや世界観はなくてもいいのでは？」"
  "と考え、"
  "テトリスライクなゲームを試作した。"]
 [:li
  "結論としては"
  "「作る事自体は可能だが、元となったオリジナルが存在する場合、"
  "何かしら追加のアイデア、世界観、キャラ、その他で秀でない限り"
  "オリジナルを越えられない」"
  "という当然の話となった。"]
 [:li
  "また、パズルをストレスなく操作できるインターフェースを構築するのは"
  "非常に手間がかかる事も分かった。"]
 ]

;;;

[:h3 (a-href-external "/op0019/"
                      "いか工船")]

[:ul
 [:li
  "第20回"
  (a-href-external "http://ahoge.info/"
                   "あほげー")
  "参加作品。"]
 [:li
  "当初は漁獲量に応じて金がもらえ、"
  "その金で装備をどんどん強化していくゲームにするつもりだったのだが、"
  "ここまで作った段階で、あまりの駄目さに投げ出してしまった。"]
 [:li
  "おそらく、装備強化ゲー部分をバランス良く実装できたとしても"
  "「こんなしょぼい自機を強化する気になれない」"
  "「まだ見てない先まで進めようという気が起こらない」"
  "という事になっていただろう。"]
 [:li
  "だが例えば、自機がカッコ良い騎士や魔術師やかわいい女の子で、"
  "イカが禍々しい飛行モンスターだったとしたらどうだろう。"
  "そこそこ遊びたくなってくるのではないだろうか。"]
 [:li
  "そういう訳で、この試作品以降は"
  "「世界観」「キャラ性」「物語性」"
  "等を追求する方向にシフトしていく…のだが、"
  "その方面の能力が極度に乏しい為、"
  "今のところ成果は特に出ていない。"]
 ]

;;;

[:h3 (a-href-external "/op0016-201602-2/"
                      "試作サイドビューオンラインゲー(仮題)")]

[:ul
 [:li
  "マリオ型のゲームで、他プレイヤーが見えると面白いかと思って作ってみたものの、"
  "マリオ型のゲームは地形データを用意するのが物凄く大変だという事を"
  "思い知らされた試作品。"]
 [:li
  "HPゲージはあるが、敵は未実装。"
  "デバッグボタンでHPを上下できるものの、HPが0になっても何も起こらない。"
  "つまりゲームとして未完成な、技術デモ状態。"]
 [:li
  "他のオンラインプレイヤーはまずいないので、"
  "複数ブラウザでこのページを開き、"
  "キャラの動きが同期しているのを見る事ぐらいしかできない。"]
 ]

;;;

[:h3 (a-href-external "/op0015/" "オッサンの冒険")]

[:ul
 [:li
  (a-href-external "http://qiita.com/advent-calendar/2015/clojure"
                   "Clojure Advent Calendar 2015")
  "の"
  (a-href-external "https://github.com/ayamada/op0015/blob/master/clojure-advent-calendar-2015.md"
                   "23日目の記事")
  "の為に作成したゲーム。とても面白くない。"]
 [:li
  "ゲーム本体は"
  (a-href-external "http://tkool.jp/mv/" "ツクールMV")
  "で作成し、ツクールMV環境から"
  (a-href-external "https://github.com/clojure/clojurescript" "cljs")
  "コードが実行できるかどうかの実験の為に作成された。"
  [:br]
  "(ついでにcljsからevalを実行する実験も同時に行っている)"
  [:br]
  "実験の結果等については前述の記事本文を参照。"
  [:br]
  [:br]
  "もう一度書いておくが、ゲーム本体はとても面白くない。実によろしくない。"
  ]
 ;[:li ""]
 ;[:li ""]
 ;[:li ""]
 ;[:li ""]
 ]

;;;

[:h3 (a-href-external "/op0013-2/" "出発進行確認完了")]

[:ul
 [:li
  (a-href-external "http://www.adventar.org/calendars/1135"
                   "あほげー Advent Calendar 2015")
  "参加作品。"]
 [:li "どうしてこのようなゲームを作ったのか、もう分からない。"]
 ]

;;;





