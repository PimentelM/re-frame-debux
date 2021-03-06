(ns example.options)

(use 'debux.core)


;; string option
(dbg (repeat 5 "x") "five repeat")


;; number option
(dbg (range 200))

(set-print-seq-length! 10)

(dbg (range))

(dbg (range) 5)


;; :if option
(doseq [i (range 10)]
  (dbg i :if (even? i)))

