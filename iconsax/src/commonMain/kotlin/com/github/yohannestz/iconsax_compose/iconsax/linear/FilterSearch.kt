package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.32f, y = 19.07f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.61f, dx2 = -0.4f, dy2 = 1.41f, dx3 = -0.91f, dy3 = 1.72f)
                lineTo(x = 12.0f, y = 21.7f)
                curveToRelative(dx1 = -1.31f, dy1 = 0.81f, dx2 = -3.13f, dy2 = -0.1f, dx3 = -3.13f, dy3 = -1.72f)
                verticalLineToRelative(dy = -5.35f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.71f, dx2 = -0.4f, dy2 = -1.62f, dx3 = -0.81f, dy3 = -2.12f)
                lineTo(x = 4.22f, y = 8.47f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.91f, dy1 = -2.02f)
                verticalLineTo(y = 4.13f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.02f, dy1 = -2.12f)
                horizontalLineToRelative(dx = 13.34f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.02f, dy1 = 2.02f)
                verticalLineToRelative(dy = 2.22f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 2.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.07f, y = 16.52f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.4f)
                moveToRelative(dx = 3.8f, dy = 0.6f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
            }
        }.build().also { _filterSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _filterSearch: ImageVector? = null
