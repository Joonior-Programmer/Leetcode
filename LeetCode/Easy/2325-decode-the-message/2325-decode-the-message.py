class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        n = len(message)
        decode = defaultdict(str)
        idx = 0
        ret = [" "] * n

        for v in key:
            if v != " " and not decode[v]:
                decode[v] = chr(97 + idx)
                idx += 1
                
        idx = 0

        for v in message:
            if v != " ":
                ret[idx] = decode[v]
            
            idx += 1
        
        return "".join(ret)