(ns sum)

(defn sum
  "Adds a collection together and returns
  the result."
  [coll]
  (reduce + coll))
