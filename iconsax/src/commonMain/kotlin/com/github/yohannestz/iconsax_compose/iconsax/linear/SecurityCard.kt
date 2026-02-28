package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                moveTo(x = 11.74f, y = 17.75f)
                horizontalLineToRelative(dx = 5.92f)
                lineToRelative(dx = -0.27f, dy = 0.23f)
                lineToRelative(dx = -4.27f, dy = 3.2f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.13f, dy1 = 0.0f)
                lineToRelative(dx = -4.28f, dy = -3.2f)
                arcTo(horizontalEllipseRadius = 4.8f, verticalEllipseRadius = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 14.56f)
                verticalLineTo(y = 7.15f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.07f, dy1 = -3.0f)
                lineToRelative(dx = 4.98f, dy = -1.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 0.0f)
                lineToRelative(dx = 4.97f, dy = 1.87f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.01f, dy1 = 2.38f)
                horizontalLineToRelative(dx = -7.3f)
                lineToRelative(dx = -0.61f, dy = 0.01f)
                curveTo(x1 = 9.27f, y1 = 6.65f, x2 = 8.79f, y2 = 7.32f, x3 = 8.79f, y3 = 9.43f)
                verticalLineToRelative(dy = 5.43f)
                curveToRelative(dx1 = 0.01f, dy1 = 2.3f, dx2 = 0.6f, dy2 = 2.89f, dx3 = 2.95f, dy3 = 2.89f)
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
                lineToRelative(dx = 0.61f, dy = -0.01f)
                horizontalLineToRelative(dx = 7.32f)
                curveTo(x1 = 21.41f, y1 = 6.52f, x2 = 22.0f, y2 = 7.1f, x3 = 22.0f, y3 = 9.42f)
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
