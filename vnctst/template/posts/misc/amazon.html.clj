; @layout  post
; @title   On the scrounge
; @comment ページ作成
; @date 2013/06/01
; @nocache true

(defn heading-2 [title & [id]]
  (let [id-true (or id title)]
    (h2 {:id id-true} title)))

(p {:class "desc"} "お願い")

(p "VNCTST gamesを運営している技情研ネット(というか山田)は現在、資金が尽きています。")
(p "もし「VNCTST gamesのゲーム/アプリが気に入った」"
   "「VNCTST gamesを支援したい」"
   "という方がいましたら、"
   "このページから寄付もしくはamazonで買い物をしていただけると"
   "非常に助かります。")
(p "(もしAdblock類を使ってる場合、リンクが見えないかも知れません。"
   "その時はすみませんが一時的に解除をお願いします。)")

;; メモ:
;; - 携帯端末から見る事も考慮し、バナー画像の横幅は最大300までとする
;; - iframeはamazon側で勝手に内容を変更されるのが嫌なので避ける
;;   (「お得な中古商品はこちら！」とか勝手に変なターゲッティングされる)

(heading-2 "paypal donation")
[:div
 {:style "margin:1em"}
 "<form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"_blank\"><input type=\"hidden\" name=\"cmd\" value=\"_xclick\" /><input type=\"hidden\" name=\"business\" value=\"T47SCVZKCCHWL\" /><input type=\"hidden\" name=\"item_name\" value=\"VNCTST games donation\" /><input type=\"hidden\" name=\"no_shipping\" value=\"1\" /><input type=\"image\" src=\"https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif\" border=\"0\" name=\"submit\" alt=\"PayPal - The safer, easier way to pay online!\" /></form>"
 ]


(heading-2 "amazon.co.jp")
[:div
 {:style "margin:1em"}
 [:a {:href "http://www.amazon.co.jp/?_encoding=UTF8&camp=247&creative=1211&linkCode=ur2&tag=tirnejp-22", :target "_blank"}
  [:img {:src "/img/amazon.gif"
         :width 300
         :height 50
         :border 0
         :alt "Amazon.co.jp 一般"}]]
 [:img {:src "http://www.assoc-amazon.jp/e/ir?t=tirnejp-22&l=ur2&o=9"
        :width 1
        :height 1
        :border 0
        :alt ""
        :style "border:none !important; margin:0px !important;"
        }]
 [:br]
 [:script {:charset "utf-8"
           :type "text/javascript"
           :src "http://ws.amazon.co.jp/widgets/q?rt=tf_sw&ServiceVersion=20070822&MarketPlace=JP&ID=V20070822/JP/tirnejp-22/8002/a689f5f6-9676-4615-ace3-46e193dd8c29"} " "]
 ]


;; TODO: 自前でリスト化/ウィジェット化しないとどうにも使い勝手が悪い、あとで考える
(heading-2 "Recommended Items")
(p {:class "desc"} "VNCTST games おすすめの商品。山田が定期的に購入する物およびその他")
[:ul [:li
      [:a {:href "http://www.amazon.co.jp/%E5%AE%9A%E6%9C%9F%E8%B3%BC%E5%85%A5%E7%89%A9/lm/R2H9UILS0KPZ7C/?_encoding=UTF8&camp=247&creative=1211&linkCode=ur2&tag=tirnejp-22", :target "_blank"}
       "定期購入物など"]
      [:img {:src "http://www.assoc-amazon.jp/e/ir?t=tirnejp-22&l=ur2&o=9"
             :width 1
             :height 1
             :border 0
             :alt ""
             :style "border:none !important; margin:0px !important;"
             }]
      ]]




