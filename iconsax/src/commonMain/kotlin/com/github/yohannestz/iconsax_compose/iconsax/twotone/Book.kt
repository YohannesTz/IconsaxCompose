package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Book: ImageVector
    get() {
        val current = _book
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Book",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.5f, y = 18.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = 1.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 10.0f)
                lineToRelative(dx = -0.01f, dy = 0.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.35f, y = 15.0f)
                horizontalLineTo(x = 20.5f)
                verticalLineToRelative(dy = 3.5f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 22.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.5f, dy1 = -3.5f)
                verticalLineToRelative(dy = -0.65f)
                arcTo(horizontalEllipseRadius = 2.86f, verticalEllipseRadius = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.35f, y1 = 15.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 7.0f)
                horizontalLineToRelative(dx = 8.0f)
                moveToRelative(dx = -8.0f, dy = 3.5f)
                horizontalLineToRelative(dx = 5.0f)
            }
        }.build().also { _book = it }
    }

@Suppress("ObjectPropertyName")
private var _book: ImageVector? = null
