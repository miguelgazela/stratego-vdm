class Piece(object):
    
    def __init__(self, rank, player):
        self.rank = rank
        self.player = player

    def get_rank(self):
        return self.rank

    def get_player(self):
        return self.player

    def __repr__(self):
        return str(self.rank)

    def __cmp__(self, other):
        if self.rank < other.rank:
            return -1
        elif self.rank > other.rank:
            return 1
        else:
            return 0