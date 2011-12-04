; define a simple function to index the letters in the
; word
(defn indexed [coll]
  (map vector (iterate inc 0) coll))
; it returns a map with index and char
(println (indexed "abcde"))

;defining a simple filter given a predicate
(defn index-filter [pred coll]
  (when pred
    (for [[idx elt] (indexed coll) :when (pred elt)] idx)))
; testing 
(println (index-filter #{\a \b} "abc"))
(println (index-filter #{\a \b} "zxy"))
(defn first-index-filter [pred coll]
  (first (index-filter pred coll)))

(println (first-index-filter #{\a \b} "abcdea"))
