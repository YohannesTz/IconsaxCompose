package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bookmark: ImageVector
    get() {
        val current = _bookmark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bookmark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 16.25f, y = 2.0f)
                verticalLineToRelative(dy = 10.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.64f, dx2 = -0.19f, dy2 = 1.12f, dx3 = -0.52f, dy3 = 1.31f)
                curveToRelative(dx1 = -0.34f, dy1 = 0.2f, dx2 = -0.88f, dy2 = 0.1f, dx3 = -1.48f, dy3 = -0.26f)
                lineToRelative(dx = -1.32f, dy = -0.79f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.86f, dy1 = 0.0f)
                lineToRelative(dx = -1.32f, dy = 0.79f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.36f, dx2 = -1.14f, dy2 = 0.45f, dx3 = -1.48f, dy3 = 0.26f)
                curveToRelative(dx1 = -0.33f, dy1 = -0.19f, dx2 = -0.52f, dy2 = -0.67f, dx3 = -0.52f, dy3 = -1.31f)
                verticalLineTo(y = 2.0f)
                close()
            }
        }.build().also { _bookmark = it }
    }

@Suppress("ObjectPropertyName")
private var _bookmark: ImageVector? = null
