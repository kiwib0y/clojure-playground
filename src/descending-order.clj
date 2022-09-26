(ns descending-order)

(defn desc-order [n]
  (let [coll (seq (str n))]
    (Integer/parseInt (apply str (reverse (sort coll))))))
