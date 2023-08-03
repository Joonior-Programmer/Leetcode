class Solution:
    def suggestedProducts(self, products: List[str], searchWord: str) -> List[List[str]]:
        n = len(products)
        ret = []
        l, r = 0, n - 1
        
        products.sort()

        for i in range(len(searchWord)):
            while l <= r and (i >= len(products[l]) or products[l][i] != searchWord[i]):
                l += 1
        
            while l <= r and (i >= len(products[r]) or  products[r][i] != searchWord[i]):
                r -= 1

            ret.append(products[l:min(l+3,r+1)])

        return ret