package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayRemove: ImageVector
    get() {
        val current = _playRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PlayRemove",
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
                moveTo(x = 9.38f, y = 12.0f)
                verticalLineToRelative(dy = -1.39f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.72f, dx2 = 1.22f, dy2 = -2.43f, dx3 = 2.7f, dy3 = -1.57f)
                lineToRelative(dx = 1.2f, dy = 0.7f)
                lineToRelative(dx = 1.2f, dy = 0.68f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.86f, dx2 = 1.5f, dy2 = 2.27f, dx3 = 0.0f, dy3 = 3.13f)
                lineToRelative(dx = -1.2f, dy = 0.7f)
                lineToRelative(dx = -1.2f, dy = 0.68f)
                curveToRelative(dx1 = -1.48f, dy1 = 0.86f, dx2 = -2.7f, dy2 = 0.16f, dx3 = -2.7f, dy3 = -1.57f)
                close()
                moveToRelative(dx = 10.69f, dy = 8.04f)
                lineToRelative(dx = -2.12f, dy = -2.11f)
                moveToRelative(dx = 2.1f, dy = 0.03f)
                lineToRelative(dx = -2.12f, dy = 2.11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 23.0f, y = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.37f, dy1 = 3.0f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 23.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.27f, dy1 = -1.73f)
                lineToRelative(dx = -0.15f, dy = -0.21f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 19.0f)
                arcToRelative(a = 3.97f, b = 3.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -4.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.28f, dy1 = 0.72f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 23.0f, y1 = 19.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.97f, y = 2.85f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 13.31f, dy1 = 12.87f)
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 11.73f, dy1 = 15.27f)
            }
        }.build().also { _playRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _playRemove: ImageVector? = null
