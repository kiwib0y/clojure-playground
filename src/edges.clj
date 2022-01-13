(ns edges)

(def graph {:nodes #{:a :c :b :d :e},
            :edges #{[:b :c] [:e :e]
                     [:c :e] [:a :d]
                     [:a :e] [:d :b]
                     [:b :a]}})

(defn dom
  "Returns the vertices in a graph
  that have an outgoing edge."
  [g]
  (set (map first (g :edges))))
