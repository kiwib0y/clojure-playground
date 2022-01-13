(ns persistent.core)

(defn persistence
  "Takes a number slicing it into a seq, then repeats
  until the product of the seq gets to a single digit number
  and returns the amount of times it had to repeat."
  [n]
  (loop [n n
         cnt 0]
    (if (< n 10)
      cnt
      (recur (reduce * (map #(Character/digit % 10) (.toString n))) (inc cnt)))))
