(use 'clojure.core)
(defn is-small? [number]
  (if (< number 100) "yes" "no"))
(println (is-small? 50))
(println (is-small? 150))
