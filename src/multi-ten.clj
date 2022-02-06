(ns multiply-by)

(defn multiply-by-ten
  "Take a colection and multiply it by 10."
  [coll]
  (map (fn [coll]
         (* coll 10)) coll))

(multiply-by-ten #{1 2 3 4})
(multiply-by-ten [1 2 3 4])
(multiply-by-ten '(1 2 3 4))
