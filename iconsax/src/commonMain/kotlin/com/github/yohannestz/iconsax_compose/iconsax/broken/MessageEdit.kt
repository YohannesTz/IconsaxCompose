package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageEdit: ImageVector
    get() {
        val current = _messageEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageEdit",
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
                moveTo(x = 22.0f, y = 8.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = -6.0f, dy2 = -6.0f)
                horizontalLineTo(x = 8.0f)
                quadTo(x1 = 2.0f, y1 = 2.0f, x2 = 2.0f, y2 = 8.0f)
                verticalLineToRelative(dy = 13.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 13.0f)
                quadToRelative(dx1 = 6.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = -6.0f)
                verticalLineToRelative(dy = -4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.5f, y = 11.74f)
                lineToRelative(dx = 0.66f, dy = -0.65f)
                lineToRelative(dx = 0.12f, dy = -0.13f)
                curveToRelative(dx1 = 0.8f, dy1 = -0.86f, dx2 = 1.13f, dy2 = -1.87f, dx3 = -0.12f, dy3 = -3.12f)
                curveToRelative(dx1 = -1.32f, dy1 = -1.32f, dx2 = -2.36f, dy2 = -0.89f, dx3 = -3.25f, dy3 = 0.0f)
                lineToRelative(dx = -5.2f, dy = 5.19f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.3f, y1 = 13.9f)
                lineTo(x = 7.0f, y = 15.88f)
                curveTo(x1 = 6.9f, y1 = 16.6f, x2 = 7.4f, y2 = 17.1f, x3 = 8.13f, y3 = 17.0f)
                lineToRelative(dx = 1.98f, dy = -0.28f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.87f, dy1 = -0.43f)
                lineToRelative(dx = 1.94f, dy = -1.94f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.17f, y = 8.58f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.25f, dy1 = 3.25f)
            }
        }.build().also { _messageEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _messageEdit: ImageVector? = null
