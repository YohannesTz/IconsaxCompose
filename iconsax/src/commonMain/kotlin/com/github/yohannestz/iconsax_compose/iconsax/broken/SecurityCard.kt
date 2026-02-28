package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SecurityCard: ImageVector
    get() {
        val current = _securityCard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SecurityCard",
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
                moveTo(x = 2.0f, y = 7.14f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.07f, dy1 = -3.0f)
                lineToRelative(dx = 4.98f, dy = -1.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 0.0f)
                lineToRelative(dx = 4.97f, dy = 1.87f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 2.38f)
                horizontalLineToRelative(dx = -7.3f)
                lineToRelative(dx = -0.6f, dy = 0.01f)
                curveToRelative(dx1 = -1.85f, dy1 = 0.11f, dx2 = -2.33f, dy2 = 0.78f, dx3 = -2.33f, dy3 = 2.9f)
                verticalLineToRelative(dy = 5.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.31f, dx2 = 0.59f, dy2 = 2.9f, dx3 = 2.94f, dy3 = 2.9f)
                horizontalLineToRelative(dx = 5.92f)
                lineToRelative(dx = -0.27f, dy = 0.23f)
                lineToRelative(dx = -4.27f, dy = 3.2f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.13f, dy1 = 0.0f)
                lineToRelative(dx = -4.28f, dy = -3.2f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.71f, dy1 = -3.42f)
                verticalLineToRelative(dy = -3.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.8f, y = 11.22f)
                horizontalLineTo(x = 22.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 9.42f)
                verticalLineToRelative(dy = 5.55f)
                curveToRelative(dx1 = -0.02f, dy1 = 2.22f, dx2 = -0.63f, dy2 = 2.77f, dx3 = -2.94f, dy3 = 2.77f)
                horizontalLineToRelative(dx = -7.32f)
                curveToRelative(dx1 = -2.35f, dy1 = 0.0f, dx2 = -2.94f, dy2 = -0.59f, dx3 = -2.94f, dy3 = -2.9f)
                verticalLineTo(y = 9.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.1f, dx2 = 0.48f, dy2 = -2.77f, dx3 = 2.33f, dy3 = -2.89f)
                horizontalLineToRelative(dx = 7.93f)
                curveTo(x1 = 21.4f, y1 = 6.51f, x2 = 22.0f, y2 = 7.1f, x3 = 22.0f, y3 = 9.41f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.32f, y = 15.26f)
                horizontalLineToRelative(dx = 1.33f)
                moveToRelative(dx = 2.1f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.27f)
            }
        }.build().also { _securityCard = it }
    }

@Suppress("ObjectPropertyName")
private var _securityCard: ImageVector? = null
