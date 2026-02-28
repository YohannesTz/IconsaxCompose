package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlobalSearch: ImageVector
    get() {
        val current = _globalSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GlobalSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -10.0f, dy1 = 10.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 3.0f)
                horizontalLineToRelative(dx = 1.0f)
                arcToRelative(a = 28.4f, b = 28.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.0f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 7.0f, dy = -18.0f)
                arcToRelative(a = 29.0f, b = 29.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.46f, dy1 = 9.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.0f, y = 16.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 29.0f, b = 29.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 9.0f, dy1 = 1.46f)
                moveTo(x = 3.0f, y = 9.0f)
                arcToRelative(a = 28.4f, b = 28.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 18.0f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.2f, y = 21.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.4f)
                moveTo(x = 22.0f, y = 22.0f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
            }
        }.build().also { _globalSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _globalSearch: ImageVector? = null
