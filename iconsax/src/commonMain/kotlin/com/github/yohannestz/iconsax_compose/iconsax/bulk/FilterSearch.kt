package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterSearch: ImageVector
    get() {
        val current = _filterSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FilterSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.75f, y = 15.41f)
                lineToRelative(dx = -0.85f, dy = -0.85f)
                arcToRelative(a = 4.24f, b = 4.24f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.22f, dy1 = 1.22f)
                lineToRelative(dx = 0.85f, dy = 0.85f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.61f, dy1 = 0.25f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.61f, dy1 = -0.25f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.22f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 5.41f, y = 2.0f)
                horizontalLineToRelative(dx = 13.17f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.91f, dx3 = 2.0f, dy3 = 2.02f)
                verticalLineToRelative(dy = 2.22f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.81f, dx2 = -0.5f, dy2 = 1.82f, dx3 = -1.0f, dy3 = 2.32f)
                lineToRelative(dx = -4.29f, dy = 3.84f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 2.32f)
                verticalLineToRelative(dy = 4.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.61f, dx2 = -0.4f, dy2 = 1.41f, dx3 = -0.9f, dy3 = 1.72f)
                lineToRelative(dx = -1.4f, dy = 0.91f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.09f, dy1 = -1.72f)
                verticalLineToRelative(dy = -5.35f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -2.12f)
                lineTo(x = 4.31f, y = 8.46f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -2.02f)
                verticalLineTo(y = 4.12f)
                curveTo(x1 = 3.42f, y1 = 2.91f, x2 = 4.32f, y2 = 2.0f, x3 = 5.41f, y3 = 2.0f)
            }
        }.build().also { _filterSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _filterSearch: ImageVector? = null
