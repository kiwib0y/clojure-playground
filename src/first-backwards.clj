(ns first-backwards)

((fn get-first-backwards [coll]
   (last (reverse coll))) [1 2 3 4 5 6])
;; => 1
