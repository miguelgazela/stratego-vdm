class Player(object):

    def __init__(self, name):
        self.name = name
        self.pieces = []

    def add_pieces(self, pieces):
        self.pieces.extend(pieces)