class Cell(object):

    def __init__(self):
        self.piece = None
        self.is_lake = False

    def __repr__(self):
        return str(self.token)

    def is_occupied(self):
        return self.piece is not None or self.is_lake

    def set_as_lake(self):
        self.is_lake = True

    def place_piece(self, piece):
        self.piece = piece

    def remove_piece(self):
        tmp = self.piece
        self.piece = None
        return tmp