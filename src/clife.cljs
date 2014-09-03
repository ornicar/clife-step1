(ns clife)

; some predefined interesting patterns
(def blinker #{[1 0] [1 1] [1 2]})
(def glider #{[1 0] [2 1] [0 2] [1 2] [2 2]})
(def r-pentomino #{[0 1] [1 0] [1 1] [1 2] [2 0]})
(def acorn #{[0 2] [1 0] [1 2] [3 1] [4 2] [5 2] [6 2]})
(def lightweight-spaceship #{[0 1] [0 2] [0 3] [1 0] [1 3] [2 3] [3 3] [4 0] [4 2]})

(def color-alive "#b0b0b0")
(def color-dead "#202020")

(defn pp
  "print and pass the parameter"
  [v]
  (.log js/console (clj->js v))
  v)

(defn render-cell
  "render a single cell, dead or alive, on a world"
  [world [x y] alive?]
  ;todo 2
  )

(defn render-world
  "render a complete world with a set of alive cells"
  [world cells]
  (pp world)
  ;todo 1
  )

(defn shift
  "return cells shifted by dx and dy"
  [cells dx dy]
  ;todo 3
  cells)

(defn ^:export hop
  "Entry point"
  []
  (let [cols 30
        rows 30
        cell-size 20
        canvas (.getElementById js/document "world")
        ctx (.getContext canvas "2d")
        world {:canvas canvas
               :ctx ctx
               :rows rows
               :cols cols
               :cell-size cell-size}
        cells (shift glider 50 30)]
    (render-world world cells)))
