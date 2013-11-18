from cell import Cell

class Board(object):

    def __init__(self):
        self.cells = [[Cell() for _ in range(10)] for _ in range(10)]
        self.create_lakes()

    def create_lakes(self):
        pos_lake = [
            (2,4), (2,5), (3, 4), (3, 5),
            (6,4), (6,5), (7,4), (7,5)
        ]

        for x, y in pos_lake:
            self.cells[x][y].set_as_lake()

    def show(self):
        for row in self.cells:
            print row

    def cell_is_free(self, x, y):
        return self.cells[x][y].is_occupied()