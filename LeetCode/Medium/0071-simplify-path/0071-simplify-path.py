class Solution:
    def simplifyPath(self, path: str) -> str:
        ret = []

        for dir in path.split("/"):
            if dir not in "..":
                ret.append(dir)
            elif dir == ".." and ret:
                ret.pop()
                
        return "/" + "/".join(ret)