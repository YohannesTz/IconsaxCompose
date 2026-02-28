package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TheGraph: ImageVector
    get() {
        val current = _theGraph
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TheGraph",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = -4.06f, dy = 8.56f)
                arcToRelative(a = 3.38f, b = 3.38f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 6.76f, dy1 = 0.0f)
                arcToRelative(a = 3.38f, b = 3.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.76f, dy1 = 0.0f)
                moveToRelative(dx = 7.65f, dy = 4.78f)
                lineToRelative(dx = -3.0f, dy = 3.0f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 3.0f, dy = -3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                moveToRelative(dx = 0.92f, dy = -7.03f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                horizontalLineToRelative(dx = 0.01f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.46f, dy1 = 1.0f, dx2 = -1.01f, dy2 = 1.0f)
            }
        }.build().also { _theGraph = it }
    }

@Suppress("ObjectPropertyName")
private var _theGraph: ImageVector? = null
