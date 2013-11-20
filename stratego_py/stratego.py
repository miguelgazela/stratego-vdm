from time import sleep
from board import Board
from player import Player
from piece import Piece

class Game(object):

    def __init__(self):
        self.board = Board()
        self.player_one = Player('P1')
        self.player_two = Player('P2')
        self.turn = self.player_one
        self.distribute_pieces()
        self.game_over = False

    def run(self):

        # place players pieces
        self.place_pieces(self.player_one)
        self.place_pieces(self.player_two)

        # start the game
        while not self.game_over:
            print 'get user input'
            print 'update game'
            self.check_game_over()
            sleep(10)
        
    def check_game_over(self):
        pass 

    def place_pieces(self, player):
        pass

    def distribute_pieces(self):
        # list of tuples with rank - num_pieces
        pieces = [
            (1,1), (2,8), (3,5), (4,4), (5,4), (6,4),
            (7,3), (8,2), (9,1), (10,1)
        ]

        self.player_one.add_pieces(self.build_pieces(pieces, self.player_one))
        self.player_two.add_pieces(self.build_pieces(pieces, self.player_two))

    def build_pieces(self, p_info, player):
        return [Piece(rank, player)
                for rank, quantity in p_info
                for _ in range(quantity)]



def main():
    game = Game()
    print game.player_one.pieces
    # game.run()

if __name__ == "__main__":
    main()