package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlobalRefresh: ImageVector
    get() {
        val current = _globalRefresh
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GlobalRefresh",
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
                moveTo(x = 21.0f, y = 9.0f)
                arcToRelative(a = 29.0f, b = 29.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -9.0f, dy1 = -1.46f)
                moveTo(x = 3.0f, y = 9.0f)
                arcToRelative(a = 29.0f, b = 29.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.85f, dy1 = -1.16f)
            }
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
                stroke = SolidColor(Color(0xFF292D32)),
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.0f, y = 16.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 29.0f, b = 29.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 9.0f, dy1 = 1.46f)
                moveToRelative(dx = 7.5f, dy = -1.76f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.25f, dy1 = -0.18f)
                arcToRelative(a = 3.74f, b = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.48f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 18.26f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.63f, dy1 = -2.08f)
                moveToRelative(dx = -1.32f, dy = -1.38f)
                lineToRelative(dx = -1.25f, dy = -1.43f)
                moveToRelative(dx = 1.25f, dy = 1.43f)
                lineToRelative(dx = -1.46f, dy = 1.06f)
            }
        }.build().also { _globalRefresh = it }
    }

@Suppress("ObjectPropertyName")
private var _globalRefresh: ImageVector? = null
